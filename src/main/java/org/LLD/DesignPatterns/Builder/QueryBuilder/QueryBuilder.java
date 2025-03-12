package org.LLD.DesignPatterns.Builder.QueryBuilder;


import org.LLD.DesignPatterns.Builder.WithBuilder;

@WithBuilder
public class QueryBuilder {


    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    private QueryBuilder() {

    }


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final QueryBuilder queryBuilder;

        public Builder() {
            queryBuilder = new QueryBuilder();
        }

        public Builder setSelect(String select) {
            queryBuilder.select = select;
            return this;
        }

        public Builder setFrom(String from) {
            queryBuilder.from = from;
            return this;
        }

        public Builder setWhere(String where) {
            queryBuilder.where = where;
            return this;
        }

        public Builder setJoin(String join) {
            queryBuilder.join = join;
            return this;
        }

        public Builder setOrderBy(String orderBy) {
            queryBuilder.orderBy = orderBy;
            return this;
        }

        public Builder setGroupBy(String groupBy) {
            queryBuilder.groupBy = groupBy;
            return this;
        }

        public QueryBuilder build() {
            return queryBuilder;
        }

    }
}