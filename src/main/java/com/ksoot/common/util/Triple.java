/*
 * Copyright 2021 the original author or authors.
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

package com.ksoot.common.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * @author Rajveer Singh
 * @param <T> Code type
 * @param <S> Name Type
 * @param <U> Type type
 */
@Getter
@AllArgsConstructor(staticName = "of")
@ToString
@EqualsAndHashCode(of = { "code" })
@ApiModel(value = "triplet", description = "Code, Name and Type triplet")
public class Triple<T, S, U> {

    @NonNull
    @ApiModelProperty(name = "code", dataType = "String", value = "Code", example = "XYD112")
    private T code;

    @NonNull
    @ApiModelProperty(name = "name", dataType = "String", value = "Name", example = "Foo Bar")
    private S name;

    @NonNull
    @ApiModelProperty(name = "type", dataType = "String", value = "Type", example = "AGENT")
    private U type;
}
