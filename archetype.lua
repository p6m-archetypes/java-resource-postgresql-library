-- java-resource-postgresql-library standalone entry point.
-- Parents consuming this library should depend on it with `library: true`
-- and call `require("java-resource-postgresql").render(context, { destination = "project-name" })`.
-- This script runs standalone to retrofit an existing project.
local context = Context.new()
require("lib").run(context)
return context
