public class MailMessage implements Sendable<String> {

    private String to,from,content;

    MailMessage (String from, String to, String content){
        this.content = content;
        this.to = to;
        this.from = from;

    }
    @Override
    public String getFrom(){
        return from;
    }
    @Override
    public String getTo(){
        return to;
    }
    @Override
    public String getContent(){
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MailMessage message = (MailMessage) o;

        if (to != null ? !to.equals(message.to) : message.to != null) return false;
        if (from != null ? !from.equals(message.from) : message.from != null) return false;
        return content != null ? content.equals(message.content) : message.content == null;
    }

    @Override
    public int hashCode() {
        int result = to != null ? to.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }


}
