/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.rails.trains.blocks.system;

import com.google.common.collect.Maps;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.input.internal.BindableAxisImpl;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by adeon on 09.09.14.
 */
public class Railway {
    private Map<EntityRef, Track> tracks = Maps.newHashMap();
    public Map<EntityRef, Track> getTracks() {
        return tracks;
    }
}