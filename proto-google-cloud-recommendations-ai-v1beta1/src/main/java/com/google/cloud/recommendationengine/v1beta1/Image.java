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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/catalog.proto

package com.google.cloud.recommendationengine.v1beta1;

/**
 *
 *
 * <pre>
 * Catalog item thumbnail/detail image.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.Image}
 */
public final class Image extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.Image)
    ImageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Image.newBuilder() to construct.
  private Image(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Image() {
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Image();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Image(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              uri_ = s;
              break;
            }
          case 16:
            {
              height_ = input.readInt32();
              break;
            }
          case 24:
            {
              width_ = input.readInt32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.Catalog
        .internal_static_google_cloud_recommendationengine_v1beta1_Image_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.Catalog
        .internal_static_google_cloud_recommendationengine_v1beta1_Image_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.Image.class,
            com.google.cloud.recommendationengine.v1beta1.Image.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object uri_;
  /**
   *
   *
   * <pre>
   * Required. URL of the image with a length limit of 5 KiB.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. URL of the image with a length limit of 5 KiB.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private int height_;
  /**
   *
   *
   * <pre>
   * Optional. Height of the image in number of pixels.
   * </pre>
   *
   * <code>int32 height = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The height.
   */
  @java.lang.Override
  public int getHeight() {
    return height_;
  }

  public static final int WIDTH_FIELD_NUMBER = 3;
  private int width_;
  /**
   *
   *
   * <pre>
   * Optional. Width of the image in number of pixels.
   * </pre>
   *
   * <code>int32 width = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The width.
   */
  @java.lang.Override
  public int getWidth() {
    return width_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uri_);
    }
    if (height_ != 0) {
      output.writeInt32(2, height_);
    }
    if (width_ != 0) {
      output.writeInt32(3, width_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uri_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, height_);
    }
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, width_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.recommendationengine.v1beta1.Image)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.Image other =
        (com.google.cloud.recommendationengine.v1beta1.Image) obj;

    if (!getUri().equals(other.getUri())) return false;
    if (getHeight() != other.getHeight()) return false;
    if (getWidth() != other.getWidth()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getWidth();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.recommendationengine.v1beta1.Image prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Catalog item thumbnail/detail image.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.Image}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.Image)
      com.google.cloud.recommendationengine.v1beta1.ImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.Catalog
          .internal_static_google_cloud_recommendationengine_v1beta1_Image_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.Catalog
          .internal_static_google_cloud_recommendationengine_v1beta1_Image_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.Image.class,
              com.google.cloud.recommendationengine.v1beta1.Image.Builder.class);
    }

    // Construct using com.google.cloud.recommendationengine.v1beta1.Image.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      uri_ = "";

      height_ = 0;

      width_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.Catalog
          .internal_static_google_cloud_recommendationengine_v1beta1_Image_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.Image getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.Image.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.Image build() {
      com.google.cloud.recommendationengine.v1beta1.Image result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.Image buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.Image result =
          new com.google.cloud.recommendationengine.v1beta1.Image(this);
      result.uri_ = uri_;
      result.height_ = height_;
      result.width_ = width_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.recommendationengine.v1beta1.Image) {
        return mergeFrom((com.google.cloud.recommendationengine.v1beta1.Image) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommendationengine.v1beta1.Image other) {
      if (other == com.google.cloud.recommendationengine.v1beta1.Image.getDefaultInstance())
        return this;
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        onChanged();
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
      }
      if (other.getWidth() != 0) {
        setWidth(other.getWidth());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.recommendationengine.v1beta1.Image parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.recommendationengine.v1beta1.Image) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     *
     *
     * <pre>
     * Required. URL of the image with a length limit of 5 KiB.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. URL of the image with a length limit of 5 KiB.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. URL of the image with a length limit of 5 KiB.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      uri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. URL of the image with a length limit of 5 KiB.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUri() {

      uri_ = getDefaultInstance().getUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. URL of the image with a length limit of 5 KiB.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      uri_ = value;
      onChanged();
      return this;
    }

    private int height_;
    /**
     *
     *
     * <pre>
     * Optional. Height of the image in number of pixels.
     * </pre>
     *
     * <code>int32 height = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Height of the image in number of pixels.
     * </pre>
     *
     * <code>int32 height = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {

      height_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Height of the image in number of pixels.
     * </pre>
     *
     * <code>int32 height = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHeight() {

      height_ = 0;
      onChanged();
      return this;
    }

    private int width_;
    /**
     *
     *
     * <pre>
     * Optional. Width of the image in number of pixels.
     * </pre>
     *
     * <code>int32 width = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Width of the image in number of pixels.
     * </pre>
     *
     * <code>int32 width = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {

      width_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Width of the image in number of pixels.
     * </pre>
     *
     * <code>int32 width = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWidth() {

      width_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.Image)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.Image)
  private static final com.google.cloud.recommendationengine.v1beta1.Image DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommendationengine.v1beta1.Image();
  }

  public static com.google.cloud.recommendationengine.v1beta1.Image getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Image> PARSER =
      new com.google.protobuf.AbstractParser<Image>() {
        @java.lang.Override
        public Image parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Image(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Image> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Image> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.Image getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
