// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/catalog_service.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface CreateCatalogItemRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The catalog item to create.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the catalogItem field is set.
   */
  boolean hasCatalogItem();
  /**
   * <pre>
   * Required. The catalog item to create.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The catalogItem.
   */
  com.google.cloud.recommendationengine.v1beta1.CatalogItem getCatalogItem();
  /**
   * <pre>
   * Required. The catalog item to create.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder getCatalogItemOrBuilder();
}
