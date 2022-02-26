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

package com.ksoot.common;

import java.time.Duration;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Application common constants.
 */
public interface CommonConstant {

	String SLASH = "/";

	String API = SLASH;

	String VERSION_v1 = "v1";

	String VERSION_v2 = "v2";

	String CURRENT_VERSION = VERSION_v1;

	String HAMMER_API = API + CURRENT_VERSION;

	String HAMMER_INTERNAL_API = API + "internal" + SLASH + CURRENT_VERSION;

	String HAMMER_EXTERNAL_API = API + "external" + SLASH + CURRENT_VERSION;

	String API_CONTEXT = "/**";

	String SYSTEM_USER = "SYSTEM";

	ZoneId ZONE_ID_UTC = ZoneId.of("UTC");

	ZoneId ZONE_ID_IST = ZoneId.of("Asia/Kolkata");

	TimeZone TIME_ZONE_UTC = TimeZone.getTimeZone(ZONE_ID_UTC);

	TimeZone TIME_ZONE_IST = TimeZone.getTimeZone(ZONE_ID_IST);

	List<ZoneId> SUPPORTED_TIME_ZONES = Arrays.asList(ZONE_ID_UTC, ZONE_ID_IST);

	Locale DEFAULT_LOCALE = Locale.getDefault();

	ZoneId DEFAULT_ZONE_ID = ZoneId.systemDefault();

	TimeZone DEFAULT_TIME_ZONE = TIME_ZONE_UTC;

	// 10 minutes
	Duration HIKARI_STAT_LOG_PERIOD = Duration.ofMinutes(10);

	String SYS_PROP_HIKARI_STAT_LOG_PERIOD = "com.zaxxer.hikari.housekeeping.periodMs";

	// void setSystemProperties() {
	// System.getProperties().setProperty(SYS_PROP_HIKARI_STAT_LOG_PERIOD, "" +
	// HIKARI_STAT_LOG_PERIOD.toMillis());
	// }

}
