package br.com.zup;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: protobuf.proto")
public final class ProtobufServiceGrpc {

  private ProtobufServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.ProtobufService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.ProtobufRequest,
      br.com.zup.ProtobufReply> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = br.com.zup.ProtobufRequest.class,
      responseType = br.com.zup.ProtobufReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.ProtobufRequest,
      br.com.zup.ProtobufReply> getSendMethod() {
    io.grpc.MethodDescriptor<br.com.zup.ProtobufRequest, br.com.zup.ProtobufReply> getSendMethod;
    if ((getSendMethod = ProtobufServiceGrpc.getSendMethod) == null) {
      synchronized (ProtobufServiceGrpc.class) {
        if ((getSendMethod = ProtobufServiceGrpc.getSendMethod) == null) {
          ProtobufServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<br.com.zup.ProtobufRequest, br.com.zup.ProtobufReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.ProtobufRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.ProtobufReply.getDefaultInstance()))
              .setSchemaDescriptor(new ProtobufServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProtobufServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtobufServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtobufServiceStub>() {
        @java.lang.Override
        public ProtobufServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtobufServiceStub(channel, callOptions);
        }
      };
    return ProtobufServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProtobufServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtobufServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtobufServiceBlockingStub>() {
        @java.lang.Override
        public ProtobufServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtobufServiceBlockingStub(channel, callOptions);
        }
      };
    return ProtobufServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProtobufServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtobufServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtobufServiceFutureStub>() {
        @java.lang.Override
        public ProtobufServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtobufServiceFutureStub(channel, callOptions);
        }
      };
    return ProtobufServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProtobufServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(br.com.zup.ProtobufRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.ProtobufReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.ProtobufRequest,
                br.com.zup.ProtobufReply>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class ProtobufServiceStub extends io.grpc.stub.AbstractAsyncStub<ProtobufServiceStub> {
    private ProtobufServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtobufServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtobufServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(br.com.zup.ProtobufRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.ProtobufReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProtobufServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProtobufServiceBlockingStub> {
    private ProtobufServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtobufServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtobufServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.ProtobufReply send(br.com.zup.ProtobufRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProtobufServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProtobufServiceFutureStub> {
    private ProtobufServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtobufServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtobufServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.ProtobufReply> send(
        br.com.zup.ProtobufRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProtobufServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProtobufServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((br.com.zup.ProtobufRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.ProtobufReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProtobufServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProtobufServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProtobufService");
    }
  }

  private static final class ProtobufServiceFileDescriptorSupplier
      extends ProtobufServiceBaseDescriptorSupplier {
    ProtobufServiceFileDescriptorSupplier() {}
  }

  private static final class ProtobufServiceMethodDescriptorSupplier
      extends ProtobufServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProtobufServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProtobufServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProtobufServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
