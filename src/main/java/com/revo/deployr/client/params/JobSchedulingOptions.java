/*
 * JobSchedulingOptions.java
 *
 * Copyright (C) 2010-2014 by Revolution Analytics Inc.
 *
 * This program is licensed to you under the terms of Version 2.0 of the
 * Apache License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0) for more details.
 *
 */
package com.revo.deployr.client.params;

/**
 * Job scheduling options.
 */
public class JobSchedulingOptions {

    /**
     * Job schedule start time in UTC.
     */
    public long startTime;

    /**
     * Job schedule repeat count.
     */
    public int repeatCount;

    /**
     * Job schedule repeat interval.
     */
    public long repeatInterval = 60000; // Default 1 minute.
}