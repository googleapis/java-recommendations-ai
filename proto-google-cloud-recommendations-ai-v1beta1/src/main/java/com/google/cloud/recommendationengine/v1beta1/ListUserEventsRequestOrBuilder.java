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
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface ListUserEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.ListUserEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent eventStore resource name, such as
   * "projects/&#42;&#47;locations/&#42;&#47;catalogs/default_catalog/eventStores/default_event_store".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent eventStore resource name, such as
   * "projects/&#42;&#47;locations/&#42;&#47;catalogs/default_catalog/eventStores/default_event_store".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. Maximum number of results to return per page. If zero, the
   * service will choose a reasonable default.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. The previous ListUserEventsResponse.next_page_token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. The previous ListUserEventsResponse.next_page_token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Filtering expression to specify restrictions over
   * returned events. This is a sequence of terms, where each term applies some
   * kind of a restriction to the returned user events. Use this expression to
   * restrict results to a specific time range, or filter events by eventType.
   *    eg: eventTime &gt; "2012-04-23T18:25:43.511Z" eventsMissingCatalogItems
   *    eventTime&lt;"2012-04-23T18:25:43.511Z" eventType=search
   *   We expect only 3 types of fields:
   *    * eventTime: this can be specified a maximum of 2 times, once with a
   *      less than operator and once with a greater than operator. The
   *      eventTime restrict should result in one contiguous valid eventTime
   *      range.
   *    * eventType: only 1 eventType restriction can be specified.
   *    * eventsMissingCatalogItems: specififying this will restrict results
   *      to events for which catalog items were not found in the catalog. The
   *      default behavior is to return only those events for which catalog
   *      items were found.
   *   Some examples of valid filters expressions:
   *   * Example 1: eventTime &gt; "2012-04-23T18:25:43.511Z"
   *             eventTime &lt; "2012-04-23T18:30:43.511Z"
   *   * Example 2: eventTime &gt; "2012-04-23T18:25:43.511Z"
   *             eventType = detail-page-view
   *   * Example 3: eventsMissingCatalogItems
   *             eventType = search eventTime &lt; "2018-04-23T18:30:43.511Z"
   *   * Example 4: eventTime &gt; "2012-04-23T18:25:43.511Z"
   *   * Example 5: eventType = search
   *   * Example 6: eventsMissingCatalogItems
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filtering expression to specify restrictions over
   * returned events. This is a sequence of terms, where each term applies some
   * kind of a restriction to the returned user events. Use this expression to
   * restrict results to a specific time range, or filter events by eventType.
   *    eg: eventTime &gt; "2012-04-23T18:25:43.511Z" eventsMissingCatalogItems
   *    eventTime&lt;"2012-04-23T18:25:43.511Z" eventType=search
   *   We expect only 3 types of fields:
   *    * eventTime: this can be specified a maximum of 2 times, once with a
   *      less than operator and once with a greater than operator. The
   *      eventTime restrict should result in one contiguous valid eventTime
   *      range.
   *    * eventType: only 1 eventType restriction can be specified.
   *    * eventsMissingCatalogItems: specififying this will restrict results
   *      to events for which catalog items were not found in the catalog. The
   *      default behavior is to return only those events for which catalog
   *      items were found.
   *   Some examples of valid filters expressions:
   *   * Example 1: eventTime &gt; "2012-04-23T18:25:43.511Z"
   *             eventTime &lt; "2012-04-23T18:30:43.511Z"
   *   * Example 2: eventTime &gt; "2012-04-23T18:25:43.511Z"
   *             eventType = detail-page-view
   *   * Example 3: eventsMissingCatalogItems
   *             eventType = search eventTime &lt; "2018-04-23T18:30:43.511Z"
   *   * Example 4: eventTime &gt; "2012-04-23T18:25:43.511Z"
   *   * Example 5: eventType = search
   *   * Example 6: eventsMissingCatalogItems
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
