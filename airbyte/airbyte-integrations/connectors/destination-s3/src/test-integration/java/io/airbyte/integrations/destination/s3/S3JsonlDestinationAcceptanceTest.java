/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.integrations.destination.s3;

import com.fasterxml.jackson.databind.JsonNode;
import io.airbyte.cdk.integrations.destination.s3.S3BaseJsonlDestinationAcceptanceTest;
import io.airbyte.cdk.integrations.standardtest.destination.ProtocolVersion;

public class S3JsonlDestinationAcceptanceTest extends S3BaseJsonlDestinationAcceptanceTest {

  @Override
  public ProtocolVersion getProtocolVersion() {
    return ProtocolVersion.V1;
  }

  @Override
  protected JsonNode getBaseConfigJson() {
    return S3DestinationTestUtils.getBaseConfigJsonFilePath();
  }

}
