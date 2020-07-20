/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 *
 */

package com.microsoft.device.display.samples.twonote.model

import java.util.ArrayList

object DataProvider {
    val notes: ArrayList<Inode> = ArrayList()

    /**
     * Create new note and add it to the top of the note list (position 0)
     */
    fun addNote(note: Inode) {
        notes.add(note)
    }
}
