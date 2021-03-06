/* Copyright 2014 Yahoo! Inc. */
/* Licensed under the terms of the 3-Clause BSD license. See LICENSE file in the project root for details. */
package com.yahoo.db.mdbm.exceptions;

public class MdbmPoolAcquireHandleFailedException extends MdbmException {
    private static final long serialVersionUID = 1L;

    public MdbmPoolAcquireHandleFailedException() {
        super();
    }

    public MdbmPoolAcquireHandleFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MdbmPoolAcquireHandleFailedException(String message) {
        super(message);
    }

    public MdbmPoolAcquireHandleFailedException(Throwable cause) {
        super(cause);
    }

}
