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

public final class Catalog {
  private Catalog() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_CategoryHierarchy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_CategoryHierarchy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_ExactPrice_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_ExactPrice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_PriceRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_PriceRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_CostsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_CostsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_Image_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_Image_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "7google/cloud/recommendationengine/v1beta1/catalog.proto\022)google.cloud.recommen"
          + "dationengine.v1beta1\032\037google/api/field_behavior.proto\0326google/cloud/recommendationengine/v1beta1/common.proto\032\034google/protobuf/struct.proto\032\034google/api/annotations.proto\"\376\003\n"
          + "\013CatalogItem\022\017\n"
          + "\002id\030\001 \001(\tB\003\340A\002\022k\n"
          + "\024category_hierarchies\030\002"
          + " \003(\0132H.google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchyB\003\340A\002\022\022\n"
          + "\005title\030\003 \001(\tB\003\340A\002\022\030\n"
          + "\013description\030\004 \001(\tB\003\340A\001\022S\n"
          + "\017item_attributes\030\005"
          + " \001(\01325.google.cloud.recommendationengine.v1beta1.FeatureMapB\003\340A\001\022\032\n\r"
          + "language_code\030\006 \001(\tB\003\340A\001\022\021\n"
          + "\004tags\030\010 \003(\tB\003\340A\001\022\032\n\r"
          + "item_group_id\030\t \001(\tB\003\340A\001\022^\n"
          + "\020product_metadata\030\n"
          + " \001(\0132=.google.cloud.recommendationengine.v1beta1.ProductCatalogItemB\003\340A\001H\000\032,\n"
          + "\021CategoryHierarchy\022\027\n\n"
          + "categories\030\001 \003(\tB\003\340A\002B\025\n"
          + "\023recommendation_type\"\346\006\n"
          + "\022ProductCatalogItem\022d\n"
          + "\013exact_price\030\001"
          + " \001(\0132H.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.ExactPriceB\003\340A\001H\000\022d\n"
          + "\013price_range\030\002"
          + " \001(\0132H.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.PriceRangeB\003\340A\001H\000\022\\\n"
          + "\005costs\030\003"
          + " \003(\0132H.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.CostsEntryB\003\340A\001\022\032\n\r"
          + "currency_code\030\004 \001(\tB\003\340A\001\022b\n"
          + "\013stock_state\030\005"
          + " \001(\0162H.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.StockStateB\003\340A\001\022\037\n"
          + "\022available_quantity\030\006 \001(\003B\003\340A\001\022\"\n"
          + "\025canonical_product_uri\030\007 \001(\tB\003\340A\001\022E\n"
          + "\006images\030\010"
          + " \003(\01320.google.cloud.recommendationengine.v1beta1.ImageB\003\340A\001\032E\n\n"
          + "ExactPrice\022\032\n\r"
          + "display_price\030\001 \001(\002B\003\340A\001\022\033\n"
          + "\016original_price\030\002 \001(\002B\003\340A\001\0320\n\n"
          + "PriceRange\022\020\n"
          + "\003min\030\001 \001(\002B\003\340A\002\022\020\n"
          + "\003max\030\002 \001(\002B\003\340A\002\032,\n\n"
          + "CostsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\002:\0028\001\"j\n\n"
          + "StockState\022\033\n"
          + "\027STOCK_STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010IN_STOCK\020\000\022\020\n"
          + "\014OUT_OF_STOCK\020\001\022\014\n"
          + "\010PREORDER\020\002\022\r\n"
          + "\tBACKORDER\020\003\032\002\020\001B\007\n"
          + "\005price\"B\n"
          + "\005Image\022\020\n"
          + "\003uri\030\001 \001(\tB\003\340A\002\022\023\n"
          + "\006height\030\002 \001(\005B\003\340A\001\022\022\n"
          + "\005width\030\003 \001(\005B\003\340A\001B\237\002\n"
          + "-com.google.cloud.recommendationengine.v1beta1P\001Z]goo"
          + "gle.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommenda"
          + "tionengine\242\002\005RECAI\252\002)Google.Cloud.Recomm"
          + "endationEngine.V1Beta1\312\002)Google\\Cloud\\Re"
          + "commendationEngine\\V1beta1\352\002,Google::Clo"
          + "ud::RecommendationEngine::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.Common.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_descriptor,
            new java.lang.String[] {
              "Id",
              "CategoryHierarchies",
              "Title",
              "Description",
              "ItemAttributes",
              "LanguageCode",
              "Tags",
              "ItemGroupId",
              "ProductMetadata",
              "RecommendationType",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_CategoryHierarchy_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_CategoryHierarchy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_CatalogItem_CategoryHierarchy_descriptor,
            new java.lang.String[] {
              "Categories",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_descriptor,
            new java.lang.String[] {
              "ExactPrice",
              "PriceRange",
              "Costs",
              "CurrencyCode",
              "StockState",
              "AvailableQuantity",
              "CanonicalProductUri",
              "Images",
              "Price",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_ExactPrice_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_ExactPrice_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_ExactPrice_descriptor,
            new java.lang.String[] {
              "DisplayPrice", "OriginalPrice",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_PriceRange_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_PriceRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_PriceRange_descriptor,
            new java.lang.String[] {
              "Min", "Max",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_CostsEntry_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_CostsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ProductCatalogItem_CostsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_Image_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommendationengine_v1beta1_Image_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_Image_descriptor,
            new java.lang.String[] {
              "Uri", "Height", "Width",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.Common.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
