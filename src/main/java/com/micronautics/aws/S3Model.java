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

package com.micronautics.aws;

public class S3Model {
    public static final int s3FileDoesNotExist = -2;
    public static final int s3FileIsOlderThanLocal = -1;
    public static final int s3FileSameAgeAsLocal = 0;
    public static final int s3FileNewerThanLocal = 1;
    public static final int s3FileDoesNotExistLocally = 2;

    public static Credentials credentials;
    public static S3 s3;
}
