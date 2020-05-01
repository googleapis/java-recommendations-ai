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
package com.google.cloud.recommendationengine.v1beta1.stub;

import static com.google.cloud.recommendationengine.v1beta1.UserEventServiceClient.ListUserEventsPagedResponse;

import com.google.api.HttpBody;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest;
import com.google.cloud.recommendationengine.v1beta1.ImportMetadata;
import com.google.cloud.recommendationengine.v1beta1.ImportUserEventsRequest;
import com.google.cloud.recommendationengine.v1beta1.ImportUserEventsResponse;
import com.google.cloud.recommendationengine.v1beta1.ListUserEventsRequest;
import com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse;
import com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsMetadata;
import com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest;
import com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse;
import com.google.cloud.recommendationengine.v1beta1.UserEvent;
import com.google.cloud.recommendationengine.v1beta1.WriteUserEventRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Recommendations AI.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class UserEventServiceStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<PurgeUserEventsRequest, PurgeUserEventsResponse, PurgeUserEventsMetadata>
      purgeUserEventsOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: purgeUserEventsOperationCallable()");
  }

  public UnaryCallable<PurgeUserEventsRequest, Operation> purgeUserEventsCallable() {
    throw new UnsupportedOperationException("Not implemented: purgeUserEventsCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<ImportUserEventsRequest, ImportUserEventsResponse, ImportMetadata>
      importUserEventsOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: importUserEventsOperationCallable()");
  }

  public UnaryCallable<ImportUserEventsRequest, Operation> importUserEventsCallable() {
    throw new UnsupportedOperationException("Not implemented: importUserEventsCallable()");
  }

  public UnaryCallable<WriteUserEventRequest, UserEvent> writeUserEventCallable() {
    throw new UnsupportedOperationException("Not implemented: writeUserEventCallable()");
  }

  public UnaryCallable<CollectUserEventRequest, HttpBody> collectUserEventCallable() {
    throw new UnsupportedOperationException("Not implemented: collectUserEventCallable()");
  }

  public UnaryCallable<ListUserEventsRequest, ListUserEventsPagedResponse>
      listUserEventsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listUserEventsPagedCallable()");
  }

  public UnaryCallable<ListUserEventsRequest, ListUserEventsResponse> listUserEventsCallable() {
    throw new UnsupportedOperationException("Not implemented: listUserEventsCallable()");
  }

  @Override
  public abstract void close();
}
