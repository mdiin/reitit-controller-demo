/*
{:dependencies #{
  "V__create_default_role.sql"
  "V__create_user_role.sql"
}}
*/
-- This is where accessible data which is simply not directly exposed lives.
create schema rcd_hidden;
grant usage on schema rcd_hidden to rcd_anonymous, rcd_user;
