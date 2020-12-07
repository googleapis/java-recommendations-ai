/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.recommendationengine.v1beta1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.recommendationengine.v1beta1.stub.CatalogServiceStub;
import com.google.cloud.recommendationengine.v1beta1.stub.CatalogServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for ingesting catalog information of the customer's website.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the CatalogServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of CatalogServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * CatalogServiceSettings catalogServiceSettings =
 *     CatalogServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CatalogServiceClient catalogServiceClient = CatalogServiceClient.create(catalogServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CatalogServiceSettings catalogServiceSettings =
 *     CatalogServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CatalogServiceClient catalogServiceClient = CatalogServiceClient.create(catalogServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class CatalogServiceClient implements BackgroundResource {
  private final CatalogServiceSettings settings;
  private final CatalogServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of CatalogServiceClient with default settings. */
  public static final CatalogServiceClient create() throws IOException {
    return create(CatalogServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CatalogServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CatalogServiceClient create(CatalogServiceSettings settings)
      throws IOException {
    return new CatalogServiceClient(settings);
  }

  /**
   * Constructs an instance of CatalogServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(CatalogServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CatalogServiceClient create(CatalogServiceStub stub) {
    return new CatalogServiceClient(stub);
  }

  /**
   * Constructs an instance of CatalogServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected CatalogServiceClient(CatalogServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CatalogServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CatalogServiceClient(CatalogServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final CatalogServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CatalogServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a catalog item.
   *
   * @param parent Required. The parent catalog resource name, such as
   *     "projects/&#42;/locations/global/catalogs/default_catalog".
   * @param catalog_item Required. The catalog item to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CatalogItem createCatalogItem(CatalogName parent, CatalogItem catalogItem) {
    CreateCatalogItemRequest request =
        CreateCatalogItemRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setCatalogItem(catalogItem)
            .build();
    return createCatalogItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a catalog item.
   *
   * @param parent Required. The parent catalog resource name, such as
   *     "projects/&#42;/locations/global/catalogs/default_catalog".
   * @param catalog_item Required. The catalog item to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CatalogItem createCatalogItem(String parent, CatalogItem catalogItem) {
    CreateCatalogItemRequest request =
        CreateCatalogItemRequest.newBuilder().setParent(parent).setCatalogItem(catalogItem).build();
    return createCatalogItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a catalog item.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CatalogItem createCatalogItem(CreateCatalogItemRequest request) {
    return createCatalogItemCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a catalog item.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateCatalogItemRequest, CatalogItem> createCatalogItemCallable() {
    return stub.createCatalogItemCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a specific catalog item.
   *
   * @param name Required. Full resource name of catalog item, such as
   *     "projects/&#42;/locations/global/catalogs/default_catalog/catalogitems/some_catalog_item_id".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CatalogItem getCatalogItem(CatalogItemPathName name) {
    GetCatalogItemRequest request =
        GetCatalogItemRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getCatalogItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a specific catalog item.
   *
   * @param name Required. Full resource name of catalog item, such as
   *     "projects/&#42;/locations/global/catalogs/default_catalog/catalogitems/some_catalog_item_id".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CatalogItem getCatalogItem(String name) {
    GetCatalogItemRequest request = GetCatalogItemRequest.newBuilder().setName(name).build();
    return getCatalogItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a specific catalog item.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CatalogItem getCatalogItem(GetCatalogItemRequest request) {
    return getCatalogItemCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a specific catalog item.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetCatalogItemRequest, CatalogItem> getCatalogItemCallable() {
    return stub.getCatalogItemCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a list of catalog items.
   *
   * @param parent Required. The parent catalog resource name, such as
   *     "projects/&#42;/locations/global/catalogs/default_catalog".
   * @param filter Optional. A filter to apply on the list results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCatalogItemsPagedResponse listCatalogItems(CatalogName parent, String filter) {
    ListCatalogItemsRequest request =
        ListCatalogItemsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFilter(filter)
            .build();
    return listCatalogItems(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a list of catalog items.
   *
   * @param parent Required. The parent catalog resource name, such as
   *     "projects/&#42;/locations/global/catalogs/default_catalog".
   * @param filter Optional. A filter to apply on the list results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCatalogItemsPagedResponse listCatalogItems(String parent, String filter) {
    ListCatalogItemsRequest request =
        ListCatalogItemsRequest.newBuilder().setParent(parent).setFilter(filter).build();
    return listCatalogItems(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a list of catalog items.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCatalogItemsPagedResponse listCatalogItems(ListCatalogItemsRequest request) {
    return listCatalogItemsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a list of catalog items.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListCatalogItemsRequest, ListCatalogItemsPagedResponse>
      listCatalogItemsPagedCallable() {
    return stub.listCatalogItemsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a list of catalog items.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListCatalogItemsRequest, ListCatalogItemsResponse>
      listCatalogItemsCallable() {
    return stub.listCatalogItemsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a catalog item. Partial updating is supported. Non-existing items will be created.
   *
   * @param name Required. Full resource name of catalog item, such as
   *     "projects/&#42;/locations/global/catalogs/default_catalog/catalogItems/some_catalog_item_id".
   * @param catalog_item Required. The catalog item to update/create. The 'catalog_item_id' field
   *     has to match that in the 'name'.
   * @param update_mask Optional. Indicates which fields in the provided 'item' to update. If not
   *     set, will by default update all fields.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CatalogItem updateCatalogItem(
      CatalogItemPathName name, CatalogItem catalogItem, FieldMask updateMask) {
    UpdateCatalogItemRequest request =
        UpdateCatalogItemRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setCatalogItem(catalogItem)
            .setUpdateMask(updateMask)
            .build();
    return updateCatalogItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a catalog item. Partial updating is supported. Non-existing items will be created.
   *
   * @param name Required. Full resource name of catalog item, such as
   *     "projects/&#42;/locations/global/catalogs/default_catalog/catalogItems/some_catalog_item_id".
   * @param catalog_item Required. The catalog item to update/create. The 'catalog_item_id' field
   *     has to match that in the 'name'.
   * @param update_mask Optional. Indicates which fields in the provided 'item' to update. If not
   *     set, will by default update all fields.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CatalogItem updateCatalogItem(
      String name, CatalogItem catalogItem, FieldMask updateMask) {
    UpdateCatalogItemRequest request =
        UpdateCatalogItemRequest.newBuilder()
            .setName(name)
            .setCatalogItem(catalogItem)
            .setUpdateMask(updateMask)
            .build();
    return updateCatalogItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a catalog item. Partial updating is supported. Non-existing items will be created.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CatalogItem updateCatalogItem(UpdateCatalogItemRequest request) {
    return updateCatalogItemCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a catalog item. Partial updating is supported. Non-existing items will be created.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<UpdateCatalogItemRequest, CatalogItem> updateCatalogItemCallable() {
    return stub.updateCatalogItemCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a catalog item.
   *
   * @param name Required. Full resource name of catalog item, such as
   *     "projects/&#42;/locations/global/catalogs/default_catalog/catalogItems/some_catalog_item_id".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteCatalogItem(CatalogItemPathName name) {
    DeleteCatalogItemRequest request =
        DeleteCatalogItemRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteCatalogItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a catalog item.
   *
   * @param name Required. Full resource name of catalog item, such as
   *     "projects/&#42;/locations/global/catalogs/default_catalog/catalogItems/some_catalog_item_id".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteCatalogItem(String name) {
    DeleteCatalogItemRequest request = DeleteCatalogItemRequest.newBuilder().setName(name).build();
    deleteCatalogItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a catalog item.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteCatalogItem(DeleteCatalogItemRequest request) {
    deleteCatalogItemCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a catalog item.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<DeleteCatalogItemRequest, Empty> deleteCatalogItemCallable() {
    return stub.deleteCatalogItemCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk import of multiple catalog items. Request processing may be synchronous. No partial
   * updating supported. Non-existing items will be created.
   *
   * <p>Operation.response is of type ImportResponse. Note that it is possible for a subset of the
   * items to be successfully updated.
   *
   * @param parent Required. "projects/1234/locations/global/catalogs/default_catalog"
   * @param request_id Optional. Unique identifier provided by client, within the ancestor dataset
   *     scope. Ensures idempotency and used for request deduplication. Server-generated if
   *     unspecified. Up to 128 characters long. This is returned as
   *     google.longrunning.Operation.name in the response.
   * @param input_config Required. The desired input location of the data.
   * @param errors_config Optional. The desired location of errors incurred during the Import.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ImportCatalogItemsResponse, ImportMetadata> importCatalogItemsAsync(
      CatalogName parent,
      String requestId,
      InputConfig inputConfig,
      ImportErrorsConfig errorsConfig) {
    ImportCatalogItemsRequest request =
        ImportCatalogItemsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setRequestId(requestId)
            .setInputConfig(inputConfig)
            .setErrorsConfig(errorsConfig)
            .build();
    return importCatalogItemsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk import of multiple catalog items. Request processing may be synchronous. No partial
   * updating supported. Non-existing items will be created.
   *
   * <p>Operation.response is of type ImportResponse. Note that it is possible for a subset of the
   * items to be successfully updated.
   *
   * @param parent Required. "projects/1234/locations/global/catalogs/default_catalog"
   * @param request_id Optional. Unique identifier provided by client, within the ancestor dataset
   *     scope. Ensures idempotency and used for request deduplication. Server-generated if
   *     unspecified. Up to 128 characters long. This is returned as
   *     google.longrunning.Operation.name in the response.
   * @param input_config Required. The desired input location of the data.
   * @param errors_config Optional. The desired location of errors incurred during the Import.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ImportCatalogItemsResponse, ImportMetadata> importCatalogItemsAsync(
      String parent, String requestId, InputConfig inputConfig, ImportErrorsConfig errorsConfig) {
    ImportCatalogItemsRequest request =
        ImportCatalogItemsRequest.newBuilder()
            .setParent(parent)
            .setRequestId(requestId)
            .setInputConfig(inputConfig)
            .setErrorsConfig(errorsConfig)
            .build();
    return importCatalogItemsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk import of multiple catalog items. Request processing may be synchronous. No partial
   * updating supported. Non-existing items will be created.
   *
   * <p>Operation.response is of type ImportResponse. Note that it is possible for a subset of the
   * items to be successfully updated.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ImportCatalogItemsResponse, ImportMetadata> importCatalogItemsAsync(
      ImportCatalogItemsRequest request) {
    return importCatalogItemsOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk import of multiple catalog items. Request processing may be synchronous. No partial
   * updating supported. Non-existing items will be created.
   *
   * <p>Operation.response is of type ImportResponse. Note that it is possible for a subset of the
   * items to be successfully updated.
   *
   * <p>Sample code:
   */
  public final OperationCallable<
          ImportCatalogItemsRequest, ImportCatalogItemsResponse, ImportMetadata>
      importCatalogItemsOperationCallable() {
    return stub.importCatalogItemsOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk import of multiple catalog items. Request processing may be synchronous. No partial
   * updating supported. Non-existing items will be created.
   *
   * <p>Operation.response is of type ImportResponse. Note that it is possible for a subset of the
   * items to be successfully updated.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ImportCatalogItemsRequest, Operation> importCatalogItemsCallable() {
    return stub.importCatalogItemsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListCatalogItemsPagedResponse
      extends AbstractPagedListResponse<
          ListCatalogItemsRequest,
          ListCatalogItemsResponse,
          CatalogItem,
          ListCatalogItemsPage,
          ListCatalogItemsFixedSizeCollection> {

    public static ApiFuture<ListCatalogItemsPagedResponse> createAsync(
        PageContext<ListCatalogItemsRequest, ListCatalogItemsResponse, CatalogItem> context,
        ApiFuture<ListCatalogItemsResponse> futureResponse) {
      ApiFuture<ListCatalogItemsPage> futurePage =
          ListCatalogItemsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListCatalogItemsPage, ListCatalogItemsPagedResponse>() {
            @Override
            public ListCatalogItemsPagedResponse apply(ListCatalogItemsPage input) {
              return new ListCatalogItemsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListCatalogItemsPagedResponse(ListCatalogItemsPage page) {
      super(page, ListCatalogItemsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListCatalogItemsPage
      extends AbstractPage<
          ListCatalogItemsRequest, ListCatalogItemsResponse, CatalogItem, ListCatalogItemsPage> {

    private ListCatalogItemsPage(
        PageContext<ListCatalogItemsRequest, ListCatalogItemsResponse, CatalogItem> context,
        ListCatalogItemsResponse response) {
      super(context, response);
    }

    private static ListCatalogItemsPage createEmptyPage() {
      return new ListCatalogItemsPage(null, null);
    }

    @Override
    protected ListCatalogItemsPage createPage(
        PageContext<ListCatalogItemsRequest, ListCatalogItemsResponse, CatalogItem> context,
        ListCatalogItemsResponse response) {
      return new ListCatalogItemsPage(context, response);
    }

    @Override
    public ApiFuture<ListCatalogItemsPage> createPageAsync(
        PageContext<ListCatalogItemsRequest, ListCatalogItemsResponse, CatalogItem> context,
        ApiFuture<ListCatalogItemsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListCatalogItemsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListCatalogItemsRequest,
          ListCatalogItemsResponse,
          CatalogItem,
          ListCatalogItemsPage,
          ListCatalogItemsFixedSizeCollection> {

    private ListCatalogItemsFixedSizeCollection(
        List<ListCatalogItemsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListCatalogItemsFixedSizeCollection createEmptyCollection() {
      return new ListCatalogItemsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListCatalogItemsFixedSizeCollection createCollection(
        List<ListCatalogItemsPage> pages, int collectionSize) {
      return new ListCatalogItemsFixedSizeCollection(pages, collectionSize);
    }
  }
}
