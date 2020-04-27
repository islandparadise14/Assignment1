package com.example.assignment1.data.entity

import com.fasterxml.jackson.annotation.JsonProperty

data class UserInfo(
    @JsonProperty("login") var login: String,
    @JsonProperty("id") var id: Long,
    @JsonProperty("node_id") var nodeId: String,
    @JsonProperty("avatar_url") var avatarUrl: String,
    @JsonProperty("gravatar_id") var gravatarId: String,
    @JsonProperty("url") var url: String,
    @JsonProperty("html_url") var htmlUrl: String,
    @JsonProperty("followers_url") var followersUrl: String,
    @JsonProperty("following_url") var followingUrl: String,
    @JsonProperty("gists_url") var gistsUrl: String,
    @JsonProperty("starred_url") var starredUrl: String,
    @JsonProperty("subscriptions_url") var subscriptions_url: String,
    @JsonProperty("organizations_url") var organizations_url: String,
    @JsonProperty("repos_url") var repos_url: String,
    @JsonProperty("events_url") var events_url: String,
    @JsonProperty("received_events_url") var received_events_url: String,
    @JsonProperty("type") var type: String,
    @JsonProperty("site_admin") var site_admin: Boolean,
)