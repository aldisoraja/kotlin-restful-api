PGDMP     6                     |            toko    13.13    13.13 
    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    19196    toko    DATABASE     h   CREATE DATABASE toko WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
    DROP DATABASE toko;
                postgres    false            �            1259    19237    api_keys    TABLE     I   CREATE TABLE public.api_keys (
    id character varying(255) NOT NULL
);
    DROP TABLE public.api_keys;
       public         heap    postgres    false            �            1259    19229    baju    TABLE       CREATE TABLE public.baju (
    id character varying(255) NOT NULL,
    create_at timestamp(6) without time zone,
    harga bigint,
    size character varying(255),
    tipe character varying(255),
    update_at timestamp(6) without time zone,
    warna character varying(255)
);
    DROP TABLE public.baju;
       public         heap    postgres    false            �          0    19237    api_keys 
   TABLE DATA           &   COPY public.api_keys (id) FROM stdin;
    public          postgres    false    201   �	       �          0    19229    baju 
   TABLE DATA           R   COPY public.baju (id, create_at, harga, size, tipe, update_at, warna) FROM stdin;
    public          postgres    false    200   �	       (           2606    19241    api_keys api_keys_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.api_keys
    ADD CONSTRAINT api_keys_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.api_keys DROP CONSTRAINT api_keys_pkey;
       public            postgres    false    201            &           2606    19236    baju baju_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.baju
    ADD CONSTRAINT baju_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.baju DROP CONSTRAINT baju_pkey;
       public            postgres    false    200            �      x�vur����� �y      �   q   x�]�1�@k�| �k|��/�EJ�4W �H(E��	i�0�dj�*Z�}h�.`=�i��>_�,5�p�T���e�������:1̈́��|.�:?�Ku������7a����     