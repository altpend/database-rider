package com.github.database.rider.core.dataset;

public class Split {
    private String script;
    private String separator;
    private String[] commentPrefixes;
    private String blockCommentStartDelimiter;
    private String blockCommentEndDelimiter;

    public Split(String script){
        this.script = script;
        this.separator = ";";
        this.commentPrefixes = new String[]{"#", "--"};
        this.blockCommentStartDelimiter = "/*";
        this.blockCommentEndDelimiter = "*/";
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }


    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String[] getCommentPrefixes() {
        return commentPrefixes;
    }

    public void setCommentPrefixes(String[] commentPrefixes) {
        this.commentPrefixes = commentPrefixes;
    }

    public String getBlockCommentStartDelimiter() {
        return blockCommentStartDelimiter;
    }

    public void setBlockCommentStartDelimiter(String blockCommentStartDelimiter) {
        this.blockCommentStartDelimiter = blockCommentStartDelimiter;
    }

    public String getBlockCommentEndDelimiter() {
        return blockCommentEndDelimiter;
    }

    public void setBlockCommentEndDelimiter(String blockCommentEndDelimiter) {
        this.blockCommentEndDelimiter = blockCommentEndDelimiter;
    }

}
