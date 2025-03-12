package org.LLD.DesignPatterns.Builder.DatabaseConfiguration;

import org.LLD.DesignPatterns.Builder.WithBuilder;

@WithBuilder
public class DatabaseConfigurationBuilder {

    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    private DatabaseConfigurationBuilder(Builder b) {
        this.databaseUrl = b.databaseUrl;
        this.username = b.username;
        this.password = b.password;
        this.maxConnections = b.maxConnections;
        this.enableCache = b.enableCache;
        this.isReadOnly = b.isReadOnly;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public Builder databaseUrl(String u) {
            this.databaseUrl = u;
            return this;
        }

        public Builder username(String u) {
            this.username = u;
            return this;
        }

        public Builder password(String p) {
            this.password = p;
            return this;
        }

        public Builder maxConnections(int m) {
            this.maxConnections = m;
            return this;
        }

        public Builder enableCache(boolean e) {
            this.enableCache = e;
            return this;
        }

        public Builder isReadOnly(boolean i) {
            this.isReadOnly = i;
            return this;
        }

        public DatabaseConfigurationBuilder build() {
            return new DatabaseConfigurationBuilder(this);
        }
    }

}