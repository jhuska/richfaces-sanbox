package src.main.java.beans;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

//import org.apache.commons.logging.Log;

@Named
@ConversationScoped
public class TestController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Conversation conversation;
	
	private String newCommentAuthor;
	
	private boolean renderInputPanel = true;
	
//	@Inject
//	private Log logger;
	
	public boolean isRenderInputPanel() {
		return renderInputPanel;
	}

	public void setRenderInputPanel(boolean renderInputPanel) {
		this.renderInputPanel = renderInputPanel;
	}
	
	public void changeRenderInputPanel() {
		this.setRenderInputPanel(!isRenderInputPanel());
//		logger.info("render panel: " + renderInputPanel);
	}

	public String getNewCommentAuthor() {
		return newCommentAuthor;
	}

	public void setNewCommentAuthor(String newCommentAuthor) {
		this.newCommentAuthor = newCommentAuthor;
	}

	public void beginConversation() {
		if (conversation.isTransient()) {
			conversation.setTimeout(120000);
			conversation.begin();
		}
	}

	public void endConversation() {
		if (!conversation.isTransient()) {
			conversation.end();
			return;
		}
	}
}