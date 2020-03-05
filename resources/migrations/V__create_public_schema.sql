/*
{:dependencies #{
  "V__create_default_role.sql"
  "V__create_user_role.sql"
}}
*/
-- This is where exposed data lives.
create schema rcd_public;
grant usage on schema rcd_public to rcd_anonymous, rcd_user;
