package br.com.zup

import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver
import java.time.LocalDateTime
import java.time.ZoneId

fun main() {
    val server = ServerBuilder
        .forPort(50051)
        .addService(FuncionarioEndpoint())
        .build()

    server.start()
    server.awaitTermination()
}

class FuncionarioEndpoint : FuncionarioServiceGrpc.FuncionarioServiceImplBase() {
    override fun cadastrar(request: FuncionarioRequest?, responseObserver: StreamObserver<FuncionarioResponse>?) {
        val nome = if (request != null) {
            if (!request.hasField(FuncionarioRequest.getDescriptor().findFieldByName("nome"))) {
                "[???]"
            } else {
                request.nome
            }
        } else {
            "[???]"
        }

        val instant = LocalDateTime.now().atZone(ZoneId.of("UTC")).toInstant()

        val criadoEm = com.google.protobuf.Timestamp.newBuilder()
            .setSeconds(instant.epochSecond)
            .setNanos(instant.nano)
            .build()

        val response = FuncionarioResponse.newBuilder()
            .setNome(nome)
            .setCriadoEm(criadoEm)
            .build()

        responseObserver?.onNext(response)
        responseObserver?.onCompleted()
    }
}