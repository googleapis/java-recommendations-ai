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
// source: google/cloud/recommendationengine/v1beta1/import.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface ImportErrorsConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.ImportErrorsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Cloud Storage path for import errors. This must be an empty,
   * existing Cloud Storage bucket. Import errors will be written to a file in
   * this bucket, one per line, as a JSON-encoded
   * `google.rpc.Status` message.
   * </pre>
   *
   * <code>string gcs_prefix = 1;</code>
   *
   * @return Whether the gcsPrefix field is set.
   */
  boolean hasGcsPrefix();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage path for import errors. This must be an empty,
   * existing Cloud Storage bucket. Import errors will be written to a file in
   * this bucket, one per line, as a JSON-encoded
   * `google.rpc.Status` message.
   * </pre>
   *
   * <code>string gcs_prefix = 1;</code>
   *
   * @return The gcsPrefix.
   */
  java.lang.String getGcsPrefix();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage path for import errors. This must be an empty,
   * existing Cloud Storage bucket. Import errors will be written to a file in
   * this bucket, one per line, as a JSON-encoded
   * `google.rpc.Status` message.
   * </pre>
   *
   * <code>string gcs_prefix = 1;</code>
   *
   * @return The bytes for gcsPrefix.
   */
  com.google.protobuf.ByteString getGcsPrefixBytes();

  public com.google.cloud.recommendationengine.v1beta1.ImportErrorsConfig.DestinationCase
      getDestinationCase();
}
