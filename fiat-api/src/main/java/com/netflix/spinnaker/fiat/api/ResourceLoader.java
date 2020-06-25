/*
 * Copyright 2020 Armory, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.fiat.api;

import com.netflix.spinnaker.kork.annotations.Alpha;
import java.util.Set;
import org.pf4j.ExtensionPoint;

/**
 * Loads Resources. For example, if you were re-writing Fiat's Account resource as a plugin,
 * loadAll() would ask Clouddriver for a list of accounts and their associated permissions.
 */
@Alpha
public interface ResourceLoader extends ExtensionPoint {
  Set<? extends Resource> loadAll();
}
