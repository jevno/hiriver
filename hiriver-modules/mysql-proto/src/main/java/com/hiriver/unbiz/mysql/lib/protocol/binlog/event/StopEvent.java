package com.hiriver.unbiz.mysql.lib.protocol.binlog.event;

import com.hiriver.unbiz.mysql.lib.protocol.Position;
import com.hiriver.unbiz.mysql.lib.protocol.binlog.BinlogEvent;

/**
 * stop event,无用
 *  
 * @author hexiufeng
 *
 */
public class StopEvent extends AbstractBinlogEvent implements BinlogEvent {

    public StopEvent(long eventBinlogPos, boolean hasCheckSum) {
        super(eventBinlogPos, hasCheckSum);
    }

    @Override
    public void parse(byte[] buf, Position pos) {

    }

}
