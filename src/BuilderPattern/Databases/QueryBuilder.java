package BuilderPattern.Databases;

@WithBuilder
public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    public QueryBuilder(Builder builder){
        this.select=builder.select;
        this.from=builder.from;
        this.where=builder.where;
        this.join=builder.join;
        this.orderBy=builder.orderBy;
        this.groupBy=builder.groupBy;
    }
    public static Builder getBuilder(){
        return new Builder();
    }

    public String getSelect() {
        return select;
    }

    public String getFrom() {
        return from;
    }

    public String getWhere() {
        return where;
    }

    public String getJoin() {
        return join;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public static class Builder{
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public QueryBuilder build(){
            return new QueryBuilder(this);
        }

        public String getSelect() {
            return select;
        }

        public Builder setSelect(String select) {
            this.select = select;
            return this;
        }

        public String getFrom() {
            return from;
        }

        public Builder setFrom(String from) {
            this.from = from;
            return this;
        }

        public String getWhere() {
            return where;
        }

        public Builder setWhere(String where) {
            this.where = where;
            return this;
        }

        public String getJoin() {
            return join;
        }

        public Builder setJoin(String join) {
            this.join = join;
            return this;
        }

        public String getOrderBy() {
            return orderBy;
        }

        public Builder setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public String getGroupBy() {
            return groupBy;
        }

        public Builder setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }
    }
}
