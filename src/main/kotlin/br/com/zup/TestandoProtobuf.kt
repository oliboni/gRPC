package br.com.zup

import java.io.FileInputStream
import java.io.FileOutputStream

fun main() {
    val request = FuncionarioRequest.newBuilder()
        .setNome("Rodrigo Olibon")
        .setCpf("000.000.000-00")
        .setSalario(2000.0)
        .setAtivo(true)
        .setCargo(Cargo.DEV)
        .addEnderecos(
            Endereco.newBuilder()
                .setLogradouro("Rua Imbituba")
                .setCep("00000-000")
                .setComplemento("Casa")
                .build()
        )
        .build()

    println(request)

    request.writeTo(FileOutputStream("funcionario-request.bin"))

    val request2 = FuncionarioRequest.newBuilder()
        .mergeFrom(FileInputStream("funcionario-request.bin"))

    request2.setCargo(Cargo.QA)
    println(request2)
}