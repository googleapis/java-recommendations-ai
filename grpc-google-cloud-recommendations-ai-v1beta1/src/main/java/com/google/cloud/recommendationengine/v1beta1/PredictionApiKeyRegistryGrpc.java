/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.recommendationengine.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments =
        "Source: google/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto")
public final class PredictionApiKeyRegistryGrpc {

  private PredictionApiKeyRegistryGrpc() {}

  public static final String SERVICE_NAME =
      "google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistry";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest,
          com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration>
      getCreatePredictionApiKeyRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePredictionApiKeyRegistration",
      requestType =
          com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest
              .class,
      responseType =
          com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest,
          com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration>
      getCreatePredictionApiKeyRegistrationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest,
            com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration>
        getCreatePredictionApiKeyRegistrationMethod;
    if ((getCreatePredictionApiKeyRegistrationMethod =
            PredictionApiKeyRegistryGrpc.getCreatePredictionApiKeyRegistrationMethod)
        == null) {
      synchronized (PredictionApiKeyRegistryGrpc.class) {
        if ((getCreatePredictionApiKeyRegistrationMethod =
                PredictionApiKeyRegistryGrpc.getCreatePredictionApiKeyRegistrationMethod)
            == null) {
          PredictionApiKeyRegistryGrpc.getCreatePredictionApiKeyRegistrationMethod =
              getCreatePredictionApiKeyRegistrationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.recommendationengine.v1beta1
                              .CreatePredictionApiKeyRegistrationRequest,
                          com.google.cloud.recommendationengine.v1beta1
                              .PredictionApiKeyRegistration>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              SERVICE_NAME, "CreatePredictionApiKeyRegistration"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.recommendationengine.v1beta1
                                  .CreatePredictionApiKeyRegistrationRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.recommendationengine.v1beta1
                                  .PredictionApiKeyRegistration.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new PredictionApiKeyRegistryMethodDescriptorSupplier(
                              "CreatePredictionApiKeyRegistration"))
                      .build();
        }
      }
    }
    return getCreatePredictionApiKeyRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest,
          com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse>
      getListPredictionApiKeyRegistrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPredictionApiKeyRegistrations",
      requestType =
          com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest
              .class,
      responseType =
          com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse
              .class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest,
          com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse>
      getListPredictionApiKeyRegistrationsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest,
            com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse>
        getListPredictionApiKeyRegistrationsMethod;
    if ((getListPredictionApiKeyRegistrationsMethod =
            PredictionApiKeyRegistryGrpc.getListPredictionApiKeyRegistrationsMethod)
        == null) {
      synchronized (PredictionApiKeyRegistryGrpc.class) {
        if ((getListPredictionApiKeyRegistrationsMethod =
                PredictionApiKeyRegistryGrpc.getListPredictionApiKeyRegistrationsMethod)
            == null) {
          PredictionApiKeyRegistryGrpc.getListPredictionApiKeyRegistrationsMethod =
              getListPredictionApiKeyRegistrationsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.recommendationengine.v1beta1
                              .ListPredictionApiKeyRegistrationsRequest,
                          com.google.cloud.recommendationengine.v1beta1
                              .ListPredictionApiKeyRegistrationsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListPredictionApiKeyRegistrations"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.recommendationengine.v1beta1
                                  .ListPredictionApiKeyRegistrationsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.recommendationengine.v1beta1
                                  .ListPredictionApiKeyRegistrationsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new PredictionApiKeyRegistryMethodDescriptorSupplier(
                              "ListPredictionApiKeyRegistrations"))
                      .build();
        }
      }
    }
    return getListPredictionApiKeyRegistrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest,
          com.google.protobuf.Empty>
      getDeletePredictionApiKeyRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePredictionApiKeyRegistration",
      requestType =
          com.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest
              .class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest,
          com.google.protobuf.Empty>
      getDeletePredictionApiKeyRegistrationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest,
            com.google.protobuf.Empty>
        getDeletePredictionApiKeyRegistrationMethod;
    if ((getDeletePredictionApiKeyRegistrationMethod =
            PredictionApiKeyRegistryGrpc.getDeletePredictionApiKeyRegistrationMethod)
        == null) {
      synchronized (PredictionApiKeyRegistryGrpc.class) {
        if ((getDeletePredictionApiKeyRegistrationMethod =
                PredictionApiKeyRegistryGrpc.getDeletePredictionApiKeyRegistrationMethod)
            == null) {
          PredictionApiKeyRegistryGrpc.getDeletePredictionApiKeyRegistrationMethod =
              getDeletePredictionApiKeyRegistrationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.recommendationengine.v1beta1
                              .DeletePredictionApiKeyRegistrationRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              SERVICE_NAME, "DeletePredictionApiKeyRegistration"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.recommendationengine.v1beta1
                                  .DeletePredictionApiKeyRegistrationRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new PredictionApiKeyRegistryMethodDescriptorSupplier(
                              "DeletePredictionApiKeyRegistration"))
                      .build();
        }
      }
    }
    return getDeletePredictionApiKeyRegistrationMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static PredictionApiKeyRegistryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionApiKeyRegistryStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<PredictionApiKeyRegistryStub>() {
          @java.lang.Override
          public PredictionApiKeyRegistryStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PredictionApiKeyRegistryStub(channel, callOptions);
          }
        };
    return PredictionApiKeyRegistryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PredictionApiKeyRegistryBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionApiKeyRegistryBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<PredictionApiKeyRegistryBlockingStub>() {
          @java.lang.Override
          public PredictionApiKeyRegistryBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PredictionApiKeyRegistryBlockingStub(channel, callOptions);
          }
        };
    return PredictionApiKeyRegistryBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static PredictionApiKeyRegistryFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionApiKeyRegistryFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<PredictionApiKeyRegistryFutureStub>() {
          @java.lang.Override
          public PredictionApiKeyRegistryFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PredictionApiKeyRegistryFutureStub(channel, callOptions);
          }
        };
    return PredictionApiKeyRegistryFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class PredictionApiKeyRegistryImplBase implements io.grpc.BindableService {

    /** */
    public void createPredictionApiKeyRegistration(
        com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePredictionApiKeyRegistrationMethod(), responseObserver);
    }

    /** */
    public void listPredictionApiKeyRegistrations(
        com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.recommendationengine.v1beta1
                    .ListPredictionApiKeyRegistrationsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListPredictionApiKeyRegistrationsMethod(), responseObserver);
    }

    /** */
    public void deletePredictionApiKeyRegistration(
        com.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest
            request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePredictionApiKeyRegistrationMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreatePredictionApiKeyRegistrationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.recommendationengine.v1beta1
                          .CreatePredictionApiKeyRegistrationRequest,
                      com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration>(
                      this, METHODID_CREATE_PREDICTION_API_KEY_REGISTRATION)))
          .addMethod(
              getListPredictionApiKeyRegistrationsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.recommendationengine.v1beta1
                          .ListPredictionApiKeyRegistrationsRequest,
                      com.google.cloud.recommendationengine.v1beta1
                          .ListPredictionApiKeyRegistrationsResponse>(
                      this, METHODID_LIST_PREDICTION_API_KEY_REGISTRATIONS)))
          .addMethod(
              getDeletePredictionApiKeyRegistrationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.recommendationengine.v1beta1
                          .DeletePredictionApiKeyRegistrationRequest,
                      com.google.protobuf.Empty>(
                      this, METHODID_DELETE_PREDICTION_API_KEY_REGISTRATION)))
          .build();
    }
  }

  /** */
  public static final class PredictionApiKeyRegistryStub
      extends io.grpc.stub.AbstractAsyncStub<PredictionApiKeyRegistryStub> {
    private PredictionApiKeyRegistryStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionApiKeyRegistryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionApiKeyRegistryStub(channel, callOptions);
    }

    /** */
    public void createPredictionApiKeyRegistration(
        com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePredictionApiKeyRegistrationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listPredictionApiKeyRegistrations(
        com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.recommendationengine.v1beta1
                    .ListPredictionApiKeyRegistrationsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPredictionApiKeyRegistrationsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deletePredictionApiKeyRegistration(
        com.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest
            request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePredictionApiKeyRegistrationMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class PredictionApiKeyRegistryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PredictionApiKeyRegistryBlockingStub> {
    private PredictionApiKeyRegistryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionApiKeyRegistryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionApiKeyRegistryBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration
        createPredictionApiKeyRegistration(
            com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest
                request) {
      return blockingUnaryCall(
          getChannel(), getCreatePredictionApiKeyRegistrationMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse
        listPredictionApiKeyRegistrations(
            com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest
                request) {
      return blockingUnaryCall(
          getChannel(), getListPredictionApiKeyRegistrationsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deletePredictionApiKeyRegistration(
        com.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest
            request) {
      return blockingUnaryCall(
          getChannel(), getDeletePredictionApiKeyRegistrationMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class PredictionApiKeyRegistryFutureStub
      extends io.grpc.stub.AbstractFutureStub<PredictionApiKeyRegistryFutureStub> {
    private PredictionApiKeyRegistryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionApiKeyRegistryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionApiKeyRegistryFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration>
        createPredictionApiKeyRegistration(
            com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePredictionApiKeyRegistrationMethod(), getCallOptions()),
          request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse>
        listPredictionApiKeyRegistrations(
            com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getListPredictionApiKeyRegistrationsMethod(), getCallOptions()),
          request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deletePredictionApiKeyRegistration(
            com.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePredictionApiKeyRegistrationMethod(), getCallOptions()),
          request);
    }
  }

  private static final int METHODID_CREATE_PREDICTION_API_KEY_REGISTRATION = 0;
  private static final int METHODID_LIST_PREDICTION_API_KEY_REGISTRATIONS = 1;
  private static final int METHODID_DELETE_PREDICTION_API_KEY_REGISTRATION = 2;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PredictionApiKeyRegistryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PredictionApiKeyRegistryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PREDICTION_API_KEY_REGISTRATION:
          serviceImpl.createPredictionApiKeyRegistration(
              (com.google.cloud.recommendationengine.v1beta1
                      .CreatePredictionApiKeyRegistrationRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration>)
                  responseObserver);
          break;
        case METHODID_LIST_PREDICTION_API_KEY_REGISTRATIONS:
          serviceImpl.listPredictionApiKeyRegistrations(
              (com.google.cloud.recommendationengine.v1beta1
                      .ListPredictionApiKeyRegistrationsRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.recommendationengine.v1beta1
                          .ListPredictionApiKeyRegistrationsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_PREDICTION_API_KEY_REGISTRATION:
          serviceImpl.deletePredictionApiKeyRegistration(
              (com.google.cloud.recommendationengine.v1beta1
                      .DeletePredictionApiKeyRegistrationRequest)
                  request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private abstract static class PredictionApiKeyRegistryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PredictionApiKeyRegistryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService
          .getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PredictionApiKeyRegistry");
    }
  }

  private static final class PredictionApiKeyRegistryFileDescriptorSupplier
      extends PredictionApiKeyRegistryBaseDescriptorSupplier {
    PredictionApiKeyRegistryFileDescriptorSupplier() {}
  }

  private static final class PredictionApiKeyRegistryMethodDescriptorSupplier
      extends PredictionApiKeyRegistryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PredictionApiKeyRegistryMethodDescriptorSupplier(String methodName) {
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
      synchronized (PredictionApiKeyRegistryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new PredictionApiKeyRegistryFileDescriptorSupplier())
                      .addMethod(getCreatePredictionApiKeyRegistrationMethod())
                      .addMethod(getListPredictionApiKeyRegistrationsMethod())
                      .addMethod(getDeletePredictionApiKeyRegistrationMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
