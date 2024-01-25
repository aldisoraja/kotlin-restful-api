package com.dsi.kotlinrestfulapi.service.impl

import com.dsi.kotlinrestfulapi.entity.Baju
import com.dsi.kotlinrestfulapi.error.NotFoundException
import org.springframework.stereotype.Service
import com.dsi.kotlinrestfulapi.model.CreateBajuRequest
import com.dsi.kotlinrestfulapi.model.BajuResponse
import com.dsi.kotlinrestfulapi.model.ListBajuRequest
import com.dsi.kotlinrestfulapi.model.UpdateBajuRequest
import com.dsi.kotlinrestfulapi.repository.BajuRepository
import com.dsi.kotlinrestfulapi.service.BajuService
import com.dsi.kotlinrestfulapi.validation.ValidationUtil
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import java.util.Date
import java.util.stream.Collectors

@Service
class BajuServiceImpl(
    val bajuRepository : BajuRepository,
    val validationUtil: ValidationUtil
) : BajuService {

    override fun list(listBajuRequest: ListBajuRequest): List<BajuResponse> {
        val page = bajuRepository.findAll(PageRequest.of(listBajuRequest.page, listBajuRequest.size))
        val baju: List<Baju> = page.get().collect(Collectors.toList())
        return baju.map { convertBajuToBajuResponse(it) }
    }

    override fun get(id: String): BajuResponse {
        val baju = findBajuByIdOrThrowNotFound(id)
        return convertBajuToBajuResponse(baju)
    }

    override fun create(createBajuRequest: CreateBajuRequest): BajuResponse {
        validationUtil.validate(createBajuRequest)

        val baju = Baju(
            id = createBajuRequest.id!!,
            size = createBajuRequest.size!!,
            warna = createBajuRequest.warna!!,
            tipe = createBajuRequest.tipe!!,
            harga = createBajuRequest.harga!!,
            createAt = Date(),
            updateAt = null
        )
        bajuRepository.save(baju)

        return convertBajuToBajuResponse(baju)
    }

    override fun update(id: String, updateBajuRequest: UpdateBajuRequest): BajuResponse {
        val baju = findBajuByIdOrThrowNotFound(id)

        validationUtil.validate(updateBajuRequest)

        baju.apply {
            size = updateBajuRequest.size!!
            warna = updateBajuRequest.warna!!
            tipe = updateBajuRequest.tipe!!
            harga = updateBajuRequest.harga!!
            updateAt = Date()
        }
        bajuRepository.save(baju)
        return convertBajuToBajuResponse(baju)
    }

    override fun delete(id: String) {
        val baju = findBajuByIdOrThrowNotFound(id)
        bajuRepository.delete(baju)
    }

    private fun findBajuByIdOrThrowNotFound(id: String): Baju{
        val baju = bajuRepository.findByIdOrNull(id)
        if (baju == null){
            throw NotFoundException()
        }else{
            return baju;
        }
    }

    private fun convertBajuToBajuResponse(baju: Baju): BajuResponse{
        return BajuResponse(
            id = baju.id,
            size = baju.size,
            warna = baju.warna,
            tipe = baju.tipe,
            harga = baju.harga,
            createAt = baju.createAt,
            updateAt = baju.updateAt
        )
    }
}