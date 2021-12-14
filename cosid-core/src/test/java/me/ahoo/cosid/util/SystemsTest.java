/*
 * Copyright [2021-2021] [ahoo wang <ahoowang@qq.com> (https://github.com/Ahoo-Wang)].
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.ahoo.cosid.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ahoo wang
 */
class SystemsTest {

    @Test
    void getCurrentProcessName() {
        String currentProcessName = Systems.getCurrentProcessName();
        Assertions.assertNotNull(currentProcessName);
    }

    @Test
    void getCurrentProcessId() {
        long processId = Systems.getCurrentProcessId();
        Assertions.assertTrue(processId > 0);
    }
}
