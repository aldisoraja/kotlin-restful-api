package com.dsi.kotlinrestfulapi.controller

import com.dsi.kotlinrestfulapi.model.*
import com.dsi.kotlinrestfulapi.service.BajuService
import org.hibernate.engine.jdbc.Size
import org.hibernate.query.Page
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class BajuController(val bajuService: BajuService) {

    @GetMapping(
        value = ["/api/baju"],
        produces = ["application/json"]
    )
    fun listBaju(@RequestParam(value = "size", defaultValue = "10") size: Int,
                 @RequestParam(value = "size", defaultValue = "0") page: Int): WebResponse<List<BajuResponse>>{
        val request = ListBajuRequest(page = page, size = size)
        val response = bajuService.list(request)
        return WebResponse(
            code = 200,
            status = "success",
            data = response
        )
    }

    @GetMapping(
        value = ["api/baju/{id}"],
        produces = ["application/json"]
    )
    fun getBaju(@PathVariable("id") id: String): WebResponse<BajuResponse>{
        val bajuResponse = bajuService.get(id)
        return WebResponse(
            code = 200,
            status = "success",
            data = bajuResponse
        )
    }

    @PostMapping(
        value = ["/api/baju"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun creatBaju(@RequestBody body: CreateBajuRequest) : WebResponse<BajuResponse> {
        val bajuResponse = bajuService.create(body)

        return WebResponse(
            code = 200,
            status = "success",
            data = bajuResponse
        )
    }

    @PutMapping(
        value = ["/api/baju/{id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateBaju(@PathVariable("id") id: String,
                   @RequestBody updateBajuRequest: UpdateBajuRequest): WebResponse<BajuResponse>{
        val bajuResponse = bajuService.update(id, updateBajuRequest)
        return WebResponse(
            code = 200,
            status = "success",
            data = bajuResponse
        )
    }

    @DeleteMapping(
        value = ["/api/baju/{id}"],
        produces = ["application/json"]
    )
    fun deleteBaju(@PathVariable("id") id: String): WebResponse<String>{
        bajuService.delete(id)
        return WebResponse(
            code = 200,
            status = "success",
            data = id
        )
    }
}