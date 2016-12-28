package org.zstack.kvm



doc {
    title "在这里填写API标题"

    desc "在这里填写API描述"

    rest {
        request {
            url "PUT /v1/hosts/kvm/actions"

            header (OAuth: 'the-session-uuid')

            clz APIKvmRunShellMsg.class

            desc ""
            
			params {

				column {
					name "hostUuids"
					enclosedIn "kvmRunShell"
					desc ""
					inUrl false
					type "Set"
					optional false
					since "0.6"
					
				}
				column {
					name "script"
					enclosedIn "kvmRunShell"
					desc ""
					inUrl false
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIKvmRunShellEvent.class
        }
    }
}