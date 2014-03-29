package org.ajm_web.study2;

/**
 * Created by jami on 2014/03/29.
 */
public class PasscheckImpl implements Passcheck{
    @Override
    public boolean check(String str) {

        //文字数チェック
        if(str.length() < 10){
            return false;
        }

        //数字チェック
        if(!str.matches(".*[0-9].*")){
            return false;
        }

        //小文字アルファベットチェック
        if(!str.matches(".*[a-z].*")){
            return false;
        }

        //大文字アルファベットチェック
        if(!str.matches(".*[A-Z].*")){
            return false;
        }

        return true;
    }
}
