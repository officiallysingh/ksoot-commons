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

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Rajveer Singh
 */
public interface DecimalValue {

	public static final int DECIMAL_POINTS_8 = 8;

	public static final int DECIMAL_POINTS_3 = 3;

	public static final BigDecimal ZERO = BigDecimal.ZERO;

	public static final BigDecimal ONE = BigDecimal.ONE;

	public static BigDecimal preciseTo8Decimals(final BigDecimal bigDecimal) {
		return preciseToDecimals(bigDecimal, DECIMAL_POINTS_8);
	}

	public static BigDecimal preciseToDecimals(final BigDecimal bigDecimal, int scale) {
		if (bigDecimal == null) {
			return null;
		}
		return bigDecimal.setScale(scale, RoundingMode.HALF_UP);
	}

	public static BigDecimal preciseTo3Decimals(final BigDecimal bigDecimal) {
		return preciseTo3Decimals(bigDecimal, DECIMAL_POINTS_3);
	}

	public static BigDecimal preciseTo3Decimals(final BigDecimal bigDecimal, int scale) {
		if (bigDecimal == null) {
			return null;
		}
		return bigDecimal.setScale(scale, RoundingMode.HALF_UP);
	}

	public static boolean isNegative(final BigDecimal value) {
		return value.compareTo(ZERO) < 0;
	}

	public static boolean isPositive(final BigDecimal value) {
		return value.compareTo(ZERO) > 0;
	}

	public static boolean isZero(final BigDecimal value) {
		return value.compareTo(ZERO) == 0;
	}

	public static boolean isOne(final BigDecimal value) {
		return value.compareTo(ONE) == 0;
	}

	public static boolean equals(final BigDecimal value1, final BigDecimal value2) {
		return value1.compareTo(value2) == 0;
	}

	public static BigDecimal of(final double value) {
		return new BigDecimal(value);
	}

	public static void validatePositive(final BigDecimal value, final String valueType) {
		if (isNegative(value)) {
			// TODO: Throw appropriate exception
			// throw new
			// RateException(RateExceptionExceptionType.VALUE_CAN_NOT_BE_NEGATIVE,
			// Status.BAD_REQUEST, valueType,
			// value);
		}
	}

}
