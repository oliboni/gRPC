package br.com.zup

import io.grpc.ManagedChannelBuilder

fun main(){
    val channel = ManagedChannelBuilder.forAddress("localhost", 50051)
        .usePlaintext()
        .build()

    val request = FuncionarioRequest.newBuilder()
        .setNome("Rodrigo Olibon")
        .setCpf("000.000.000-00")
        .setSalario(2000.0)
        .setIdade(25)
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

    val client = FuncionarioServiceGrpc.newBlockingStub(channel)

    val response = client.cadastrar(request)
    println(response)
}