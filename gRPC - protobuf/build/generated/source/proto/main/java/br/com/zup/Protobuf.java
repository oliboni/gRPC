// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package br.com.zup;

public final class Protobuf {
  private Protobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_ProtobufRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_ProtobufRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_ProtobufReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_ProtobufReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016protobuf.proto\022\nbr.com.zup\"\037\n\017Protobuf" +
      "Request\022\014\n\004name\030\001 \001(\t\" \n\rProtobufReply\022\017" +
      "\n\007message\030\001 \001(\t2S\n\017ProtobufService\022@\n\004se" +
      "nd\022\033.br.com.zup.ProtobufRequest\032\031.br.com" +
      ".zup.ProtobufReply\"\000B\036\n\nbr.com.zupB\010Prot" +
      "obufP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_br_com_zup_ProtobufRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_br_com_zup_ProtobufRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_ProtobufRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_br_com_zup_ProtobufReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_br_com_zup_ProtobufReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_ProtobufReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
