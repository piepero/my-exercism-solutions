import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {
    
    private static final int REVERSE_MASK = 0b10000;
    
    private enum SignalMask {
        WINK (0b1, Signal.WINK),
        DOUBLE_BLINK (0b10, Signal.DOUBLE_BLINK),
        CLOSE_YOUR_EYES (0b100, Signal.CLOSE_YOUR_EYES),
        JUMP (0b1000, Signal.JUMP);
        
        private int mask;
        private Signal signal;
        
        private SignalMask(int mask, Signal signal) {
            this.mask = mask;
            this.signal = signal;
        }
        
        public int getMask() {
            return this.mask;
        }
        
        public Signal getSignal() {
            return this.signal;
        }
    }
    
    List<Signal> calculateHandshake(int number) {
        List<Signal> signalList = new ArrayList<Signal>();
        
        for (SignalMask mask: SignalMask.values()) {
            if ((number & mask.getMask()) > 0) {
                signalList.add(mask.getSignal());
            }
        }
        
        if ((number & REVERSE_MASK) > 0) {
            Collections.reverse(signalList);
        }            
        return signalList;
    }

}
