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

package com.google.cloud.recommendationengine.v1beta1.stub;

import static com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistryClient.ListPredictionApiKeyRegistrationsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest;
import com.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest;
import com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest;
import com.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse;
import com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the PredictionApiKeyRegistry service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
public abstract class PredictionApiKeyRegistryStub implements BackgroundResource {

  public UnaryCallable<CreatePredictionApiKeyRegistrationRequest, PredictionApiKeyRegistration>
      createPredictionApiKeyRegistrationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createPredictionApiKeyRegistrationCallable()");
  }

  public UnaryCallable<
          ListPredictionApiKeyRegistrationsRequest, ListPredictionApiKeyRegistrationsPagedResponse>
      listPredictionApiKeyRegistrationsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listPredictionApiKeyRegistrationsPagedCallable()");
  }

  public UnaryCallable<
          ListPredictionApiKeyRegistrationsRequest, ListPredictionApiKeyRegistrationsResponse>
      listPredictionApiKeyRegistrationsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listPredictionApiKeyRegistrationsCallable()");
  }

  public UnaryCallable<DeletePredictionApiKeyRegistrationRequest, Empty>
      deletePredictionApiKeyRegistrationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deletePredictionApiKeyRegistrationCallable()");
  }

  @Override
  public abstract void close();
}
