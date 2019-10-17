package br.com.app.user.entrypoint.jms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.validation.Validator;

@Component
@Slf4j
public class SendNotificationJms {

    private final Validator validator;

    public SendNotificationJms(final Validator validator) {
        this.validator = validator;
    }

    public void onReceiveNotification() {

    }
}
