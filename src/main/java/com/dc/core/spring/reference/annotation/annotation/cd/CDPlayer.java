package com.dc.core.spring.reference.annotation.annotation.cd;

import com.dc.core.spring.reference.annotation.annotation.cdplayer.CompactDisc;
import com.dc.core.spring.reference.annotation.annotation.cdplayer.SgtPeppers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by in IntelliJ IDEA.
 * cd播放实现类
 *
 * @author Joney
 * @create 2016-09-19-0:38
 */

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

//    @Autowired
//    public CDPlayer(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }

    @Autowired
    @Qualifier("getBean123")
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }
//    @Autowired
//    public void insertDisc(CompactDisc compactDisc) {
//        this.compactDisc=compactDisc;
//    }

    @BeanAliasFor(name = "getBean123")
    public CompactDisc getBean(){
        return new SgtPeppers();
    }
    @Override
    public void play() {

    }
}
