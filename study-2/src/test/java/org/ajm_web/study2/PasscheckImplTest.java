package org.ajm_web.study2;

import org.junit.Test;

/**
 * Created by jami on 2014/03/29.
 */
public class PasscheckImplTest {
    
    private boolean checkio(String str){
        Passcheck passcheck = new PasscheckImpl();
        return passcheck.check(str);
    }
    
    @Test
    public void testCheck() throws Exception {
        
        
        
        assert checkio("A1213pokl") == false;
        assert checkio("bAse730onE") == true;
        assert checkio("asasasasasasasaas") == false;
        assert checkio("QWERTYqwerty") == false;
        assert checkio("123456123456") == false;
        assert checkio("QwErTy911poqqqq") == true;

    }
}
