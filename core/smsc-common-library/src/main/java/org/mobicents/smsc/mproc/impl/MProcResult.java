/*
 * TeleStax, Open Source Cloud Communications  
 * Copyright 2012, Telestax Inc and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.smsc.mproc.impl;

import javolution.util.FastList;

import org.mobicents.smsc.library.Sms;

/**
*
* @author sergey vetyutnev
*
*/
public class MProcResult {

    private FastList<Sms> messageList;
    private boolean messageIsRejected;
    private boolean messageIsDropped;
    private boolean messageIsRerouted;
    private int newNetworkId;

    public MProcResult() {
    }

    public FastList<Sms> getMessageList() {
        return messageList;
    }

    public void setMessageList(FastList<Sms> val) {
        messageList = val;
    }

    public boolean isMessageRejected() {
        return messageIsRejected;
    }

    public void setMessageRejected(boolean val) {
        messageIsRejected = val;
    }

    public boolean isMessageDropped() {
        return messageIsDropped;
    }

    public void setMessageDropped(boolean val) {
        messageIsDropped = val;
    }

    public boolean isMessageIsRerouted() {
        return messageIsRerouted;
    }

    public void setMessageIsRerouted(boolean messageIsRerouted) {
        this.messageIsRerouted = messageIsRerouted;
    }

    public int getNewNetworkId() {
        return newNetworkId;
    }

    public void setNewNetworkId(int newNetworkId) {
        this.newNetworkId = newNetworkId;
    }

}
