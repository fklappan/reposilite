/*
 * Copyright (c) 2017 Dzikoysk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.panda_lang.nanomaven.server.router;

import fi.iki.elonen.NanoHTTPD;
import org.panda_lang.nanomaven.NanoMaven;
import org.panda_lang.nanomaven.server.NanoHttpdServer;
import org.panda_lang.nanomaven.server.NanoRouter;

public class NanoPanelRouter implements NanoRouter {

    public NanoPanelRouter(NanoMaven nanoMaven) {

    }

    @Override
    public NanoHTTPD.Response serve(NanoHttpdServer server, NanoHTTPD.IHTTPSession session) {
        return NanoHTTPD.newFixedLengthResponse("#TODO");
    }

}
