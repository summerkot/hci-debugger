/**************************************************************************
 * This file is part of HCI Debugger                                      *
 * <p/>                                                                   *
 * Copyright (C) 2016-2017  Bertrand Martel                                    *
 * <p/>                                                                   *
 * HCI Debugger is free software: you can redistribute it and/or modify         *
 * it under the terms of the GNU General Public License as published by   *
 * the Free Software Foundation, either version 3 of the License, or      *
 * (at your option) any later version.                                    *
 * <p/>                                                                   *
 * HCI Debugger is distributed in the hope that it will be useful,              *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of         *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the          *
 * GNU General Public License for more details.                           *
 * <p/>                                                                   *
 * You should have received a copy of the GNU General Public License      *
 * along with HCI Debugger.  If not, see <http://www.gnu.org/licenses/>.        *
 */
package com.github.akinaru.hcidebugger.model;

import java.util.Date;

/**
 * Bluetooth HCI SCO packet
 *
 * @author Bertrand Martel
 */
public class PacketHciScoData extends Packet {

    public PacketHciScoData(int num, Date timestamp, PacketDest dest, ValuePair type, String jsonFormattedHciPacket, String jsonFormattedSnoopPacket) {
        super(num, timestamp, dest, type, jsonFormattedHciPacket, jsonFormattedSnoopPacket);
    }

    @Override
    public String getDisplayedInfo() {
        return "";
    }
}
