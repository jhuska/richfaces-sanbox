package org.jboss.richfaces.tests;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.richfaces.application.push.MessageException;
import org.richfaces.application.push.TopicKey;
import org.richfaces.application.push.TopicsContext;

@ManagedBean
@RequestScoped
public class FormBean {

    public void addEvent() throws MessageException {
        final TopicKey topicKey = new TopicKey("errorCdi");
        final TopicsContext topicsContext = TopicsContext.lookup();
        topicsContext.publish(topicKey, "foo");
    }
}
