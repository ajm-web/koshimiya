package org.ajm_web.study2;

import java.util.Optional;

public class PasscheckImpl implements Passcheck{
    @Override
    public boolean check(String str) {

        return Optional.ofNullable(str)
                .filter(s -> s.length() >= 10)
                .filter(s -> s.matches(".*[0-9].*"))
                .filter(s -> s.matches(".*[A-Z].*"))
                .filter(s -> s.matches(".*[a-z].*"))
                .isPresent();

    }
}
