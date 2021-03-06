// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: funcionario_service.proto

package br.com.zup;

public interface FuncionarioRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:br.com.zup.FuncionarioRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string nome = 1;</code>
   * @return The nome.
   */
  java.lang.String getNome();
  /**
   * <code>string nome = 1;</code>
   * @return The bytes for nome.
   */
  com.google.protobuf.ByteString
      getNomeBytes();

  /**
   * <code>string cpf = 2;</code>
   * @return The cpf.
   */
  java.lang.String getCpf();
  /**
   * <code>string cpf = 2;</code>
   * @return The bytes for cpf.
   */
  com.google.protobuf.ByteString
      getCpfBytes();

  /**
   * <code>int32 idade = 3;</code>
   * @return The idade.
   */
  int getIdade();

  /**
   * <code>double salario = 4;</code>
   * @return The salario.
   */
  double getSalario();

  /**
   * <code>bool ativo = 5;</code>
   * @return The ativo.
   */
  boolean getAtivo();

  /**
   * <code>.br.com.zup.Cargo cargo = 6;</code>
   * @return The enum numeric value on the wire for cargo.
   */
  int getCargoValue();
  /**
   * <code>.br.com.zup.Cargo cargo = 6;</code>
   * @return The cargo.
   */
  br.com.zup.Cargo getCargo();

  /**
   * <code>repeated .br.com.zup.Endereco enderecos = 7;</code>
   */
  java.util.List<br.com.zup.Endereco> 
      getEnderecosList();
  /**
   * <code>repeated .br.com.zup.Endereco enderecos = 7;</code>
   */
  br.com.zup.Endereco getEnderecos(int index);
  /**
   * <code>repeated .br.com.zup.Endereco enderecos = 7;</code>
   */
  int getEnderecosCount();
  /**
   * <code>repeated .br.com.zup.Endereco enderecos = 7;</code>
   */
  java.util.List<? extends br.com.zup.EnderecoOrBuilder> 
      getEnderecosOrBuilderList();
  /**
   * <code>repeated .br.com.zup.Endereco enderecos = 7;</code>
   */
  br.com.zup.EnderecoOrBuilder getEnderecosOrBuilder(
      int index);
}
