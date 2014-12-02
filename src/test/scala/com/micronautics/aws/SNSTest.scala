/* Copyright 2012-2014 Micronautics Research Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License. */

package com.micronautics.aws

import org.scalatest.{BeforeAndAfterAll, BeforeAndAfter, WordSpec, Matchers}

class SNSTest extends WordSpec with Matchers with BeforeAndAfter with BeforeAndAfterAll with Fixtures {
  def sns = new SNS(s3.awsCredentials.getAWSAccessKeyId, s3.awsCredentials.getAWSSecretKey)

  "Blah" must {
    "blah" in {
    }
  }
}
