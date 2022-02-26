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

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Rajveer Singh
 */
public class AtomicCounter implements Comparable<AtomicCounter> {

	private final String name; // counter name

	private final AtomicInteger count;// current value

	/**
	 * Initializes a new counter starting at 0, with the given name.
	 * @param id the name of the counter
	 */
	private AtomicCounter(final String name, final int initialValue) {
		this.name = name;
		this.count = new AtomicInteger(initialValue);
	}

	/**
	 * Initializes a new counter starting at 0, with the given name.
	 * @param name the name of the counter
	 * @return AtomicCounter
	 */
	public static AtomicCounter initialize(final String name) {
		return new AtomicCounter(name, 0);
	}

	/**
	 * Initializes a new counter starting at 0, with the given id.
	 * @param name the name of the counter
	 * @param initialValue Initial value of the counter
	 * @return AtomicCounter
	 */
	public static AtomicCounter initialize(final String name, final int initialValue) {
		return new AtomicCounter(name, initialValue);
	}

	/**
	 * Increments the counter by 1.
	 */
	public void increment() {
		this.count.incrementAndGet();
	}

	/**
	 * Increments the counter by 1 and returns the incremented value.
	 * @return Counter value
	 */
	public int incrementAndGet() {
		return this.count.incrementAndGet();
	}

	/**
	 * Increments the counter by 1 and returns the same.
	 * @return Increment and get Counter value
	 */
	public int getAndIncrement() {
		return this.count.getAndIncrement();
	}

	/**
	 * Returns the current counter value.
	 * @return Counter value
	 */
	public int get() {
		return this.count.get();
	}

	/**
	 * Returns the current value of this counter.
	 * @return the current value of this counter
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Returns a string representation of this counter.
	 * @return a string representation of this counter
	 */
	@Override
	public String toString() {
		return this.name + ": " + this.count;
	}

	/**
	 * Compares this counter to the specified counter.
	 * @param that the other counter
	 * @return {@code 0} if the value of this counter equals the value of that counter; a
	 * negative integer if the value of this counter is less than the value of that
	 * counter; and a positive integer if the value of this counter is greater than the
	 * value of that counter
	 */
	@Override
	public int compareTo(final AtomicCounter that) {
		return this.count.get() - that.count.get();
	}

}
