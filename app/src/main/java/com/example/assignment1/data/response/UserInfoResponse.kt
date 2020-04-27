package com.example.assignment1.data.response

import com.fasterxml.jackson.annotation.JsonProperty

data class UserInfoResponse(
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
    @JsonProperty("name") var name: String,
    @JsonProperty("company") var company: String?,
    @JsonProperty("blog") var blog: String?,
    @JsonProperty("location") var location: String?,
    @JsonProperty("email") var email: String?,
    @JsonProperty("hireable") var hireable: String?,
    @JsonProperty("bio") var bio: String?,
    @JsonProperty("public_repos") var public_repos: Int,
    @JsonProperty("public_gists") var public_gists: Int,
    @JsonProperty("followers") var followers: Int,
    @JsonProperty("following") var following: Int,
    @JsonProperty("created_at") var created_at: String,
    @JsonProperty("updated_at") var updated_at: String
)