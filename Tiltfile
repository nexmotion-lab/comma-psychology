docker_build('sunwoo3856/psychology-service', '.')

k8s_yaml(kustomize('k8s/overlays/development'))

k8s_resource('psychology-service', port_forwards=['9004'])